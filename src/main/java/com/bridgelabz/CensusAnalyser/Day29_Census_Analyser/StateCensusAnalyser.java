package com.bridgelabz.CensusAnalyser.Day29_Census_Analyser;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.Exceptions.Exception_InvalidDataType;
import com.Exceptions.Exception_InvalidFile;
import com.census_analyser.entity.CensusData;
import com.opencsv.CSVReader;

public class StateCensusAnalyser {

	List<CensusData> censusData = new ArrayList<>();// Storing Data in list

	/* Method to load CSV data */
	public void loadCensusData(String filePath) throws Exception {
		try { /* CSV File Path */
			CSVReader csvReader = new CSVReader(new FileReader(filePath));

			String[] csvdata;
			int count = 0;
			csvdata = csvReader.readNext();
			while ((csvdata = csvReader.readNext()) != null) {
				censusData.add(new CensusData(csvdata[0], Long.parseLong(csvdata[1]), Integer.parseInt(csvdata[2]),
						Double.parseDouble(csvdata[3])));
				count++;
			}	
			  for (CensusData info : censusData) { System.out.println(info);
			  }
			 
		} catch (FileNotFoundException e) {
			throw new Exception_InvalidFile("Enter a Valid File Name");
			
		} catch (NumberFormatException e) {
			throw new Exception_InvalidDataType("Invalid Data Type !! please Input Valid one.");
	  }

	}

	public Object censusEntries() {
		if (censusData.size() == 29)
			return true;
		return false;
	}
}