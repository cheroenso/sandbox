package com.cwb.review;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class FileStorage {
	public static String userFile = "/tmp/data/users.txt";
	
	FileStorage(){
		
	}
	
	public void storeUser(String user){
		PrintWriter pw = null;
		try {
			pw = new PrintWriter( new FileWriter(userFile, true));
			if (user.length() > 0){
				// set the unique id for this record
				user = this.getNextId() + "," + user; 
				pw.println(user);
				pw.close();
			}
		} catch (Exception e){
			System.err.println("Caught Exception: " + e.getMessage());
		}
	}	
	
	/**
	 * Get ids for all the records in the file.
	 * Find the highest value, increment that value by 1`,
	 * then return it as an Integer.
	 * Assumes that the first item in a line is an int and represents the 
	 * user id.
	 * @return
	 */
	public Integer getNextId(){
		Integer id = 0;
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(userFile));
			String l;
			ArrayList<Integer> list = new ArrayList<Integer>();
			while (( l = br.readLine()) != null){
				String[] line = l.split(",");
				try {
					list.add(new Integer(line[0]));					
				} catch (NumberFormatException e) {
					System.out.println("DATA ERROR: id field is not an integer" + e.getMessage());
				}
			}
			// sort the first field
			Collections.sort(list);
			// get the last (highest value) object
			id = list.get(list.size()-1);
			// increment so next id is guaranteed to be highest integer
			id = id.intValue() + 1;
		} catch (Exception e){
			System.err.println("Caught Exception: " + e.getMessage());
		}
		return id;
	}

}
