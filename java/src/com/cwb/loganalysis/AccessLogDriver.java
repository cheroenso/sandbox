package com.cwb.loganalysis;


/**
 * Driver for AccessLogEvaluator
 * @author cbrann
 * @since 2012-05-09
 * 
 */
public class AccessLogDriver {
	
	public static void main(String[] args){
		System.out.println("Averaging values for requests...");
		StringBuffer buff = new StringBuffer();
		buff.append("\nUsage:");
		buff.append("\nAverager <requestfile>");
		try {
			if (args == null || args.length != 1) {
				System.out.println(buff.toString());
				return;
			}
			AccessLogEvaluator evaluator = new AccessLogEvaluator(args[0]);
			evaluator.processLogFile(args[0]);
		} catch (Exception e) {
			System.out.println(e.getStackTrace());
		}
	}

}
