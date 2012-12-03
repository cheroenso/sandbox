package com.cwb.loganalysis;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.cwb.request.InputHandler;

/**
 * Average times from specific input file. Reporting is based on the "test_id=" parameter at the end of the URL.
 * If "test_id=" is not set the line will be ignored.
 * Sample input line:
 * {@code /is/image/AutomationISIR?src=OakRecessedFullDoor&cache=off&test_id=1000 77 7 69}
 * This is prepared by running the script get_times_from_log.sh against the access log following a test run.
 * Script:
 * {@code cat $1 | awk '{print $16, $8 - $31, $9, $10}' | grep test_id}
 * @author cbrann
 * @since 2012-05-09
 * 
 */
public class AccessLogEvaluator {
	public static int URL = 0;
	public static int PROCESSING = 1;
	public static int PARSE = 2;
	public static int FETCH = 3;
	public static int REQUEST_TYPE = 4;
	public static String TAB = "\t";
	public static String REPORT_HEADER = "ID\tPROCESS\tPARSE\tFETCH\tREQ_TYPE\tURL";
	public static String TEST_ID = "test_id=";
	public static String fileNameFormat = "yyyy-MM-dd hh:mm";
	private String accessLog;
	public ArrayList<String> reportSet = null;	// not currently used

	AccessLogEvaluator(String file){
		accessLog = file;
	}
	
	public void processLogFile(String file) {
		InputHandler input = new InputHandler();
		String logfile = file;
		System.out.println("logfile: " + logfile);
		ArrayList<String> requestSet = input.getAllRequestsFromFile(logfile);
		Iterator<String> itr = requestSet.iterator();
		HashMap<String, Integer> hmTotals = new HashMap<String, Integer>();
		HashMap<String, Integer> hmCounts = new HashMap<String, Integer>();
		HashMap<String, Integer> hmParse = new  HashMap<String, Integer>();
		HashMap<String, Integer> hmFetch = new  HashMap<String, Integer>();
		HashMap<String, String> hmRequestType = new  HashMap<String, String>();
		HashMap<String, String> hmUrls = new HashMap<String, String>();
		String[] params = {"",""};
		NumberFormat avgFormatter = new DecimalFormat("#0.00");
		while (itr.hasNext()){
			String line = itr.next().toString();
			String testId = "";
			// TODO - handle incorrect or incomplete data
			params = line.split(" ");
			// get test_id from the URL
			testId = params[URL].substring(params[URL].indexOf(TEST_ID) + 8);
			// see if we already have the key
			if (hmTotals.containsKey(testId)){
				// we have the key, so get the current totals
				try {
					int count = hmCounts.get(testId).intValue();
					int time = hmTotals.get(testId).intValue();
					int parseTime = hmParse.get(testId).intValue();
					int fetchTime = hmFetch.get(testId).intValue();
					// add the parameter values to existing totals
					time += this.convertParam(params[PROCESSING]);
					parseTime += this.convertParam(params[PARSE]);
					fetchTime += this.convertParam(params[FETCH]);
					// keep track of number of requests for this test
					count++;
					// store the new time values
					hmCounts.put(testId, new Integer(count));
					hmTotals.put(testId, new Integer(time));
					hmParse.put(testId, new Integer(parseTime));
					hmFetch.put(testId, new Integer(fetchTime));
				} catch (NumberFormatException ne) {
					System.err.println(line + " ... " + ne.getMessage());
				}
			} else if (testId.length() > 0) {
				try {
					// start counting the number of requests for this key
					hmCounts.put(testId, new Integer(1));
					// start totals for each time slot
					hmTotals.put(testId, new Integer(params[PROCESSING]));	
					hmParse.put(testId, new Integer(params[PARSE]));
					hmFetch.put(testId, new Integer(params[FETCH]));
					// save the URL for this key
					hmUrls.put(testId,params[URL]);
					hmRequestType.put(testId,params[REQUEST_TYPE]);
					hmUrls.put(testId,params[URL]);
				} catch (NumberFormatException ne) {
					System.err.println(line + " ... " + ne.getMessage());
				}
			} else {
				System.err.println("Unrecognized test_id parameter for: " + testId);
			}
		}
		// Through accumulating time totals, now print out the report
		Set processSet = hmTotals.entrySet();
		Iterator setIterator = processSet.iterator();
		this.reportSet = new ArrayList<String>();
		SimpleDateFormat formatter = new SimpleDateFormat(fileNameFormat);
		Date now = new Date();
		System.out.println("Analysis: " + formatter.format(now));
		System.out.println(REPORT_HEADER);
		while (setIterator.hasNext()){
			Map.Entry<String, Integer> me = (Map.Entry<String, Integer>)setIterator.next();
			Integer total = (Integer)me.getValue();
			Integer parse = hmParse.get(me.getKey());
			Integer fetch = hmFetch.get(me.getKey());
			Integer count = hmCounts.get(me.getKey());
			Double processAvg = new Double(total.doubleValue() / count.doubleValue());
			Double parseAvg = new Double(parse.doubleValue() / count.doubleValue());
			Double fetchAvg = new Double(fetch.doubleValue() / count.doubleValue());
			StringBuffer outBuff = new StringBuffer();
			outBuff.append(me.getKey()); // test id
			outBuff.append(TAB);
			outBuff.append(avgFormatter.format(processAvg));
			outBuff.append(TAB);
			outBuff.append(avgFormatter.format(parseAvg));
			outBuff.append(TAB);
			outBuff.append(avgFormatter.format(fetchAvg));
			outBuff.append(TAB);
			outBuff.append(hmRequestType.get(me.getKey()));
			outBuff.append(TAB);
			outBuff.append(hmUrls.get(me.getKey()));
			System.out.println(outBuff.toString());
			// adding to global ArrayList. Might use this later
			reportSet.add(outBuff.toString());
		}
	}
		
	
	/**
	 * Convert any unrecognized parameters to 0
	 * @param param
	 * @return
	 */
	private int convertParam(String param){
		Integer time = null;
		try {
			if (param != null) {
				time = new Integer(param).intValue();
			} else {
				time = new Integer(0);
			}
		} catch (NumberFormatException e) {
			time = new Integer(0);
			System.err.println(e.getMessage());
		}
		return time;
	}


}
