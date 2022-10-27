package com.bridgelabz.CensusAnalyser.Day29_Census_Analyser;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.census_analyser.analyser.StateCensusAnalyser;

public class CensusAnalyserTest {

	StateCensusAnalyser analyser = new StateCensusAnalyser();

	/* Testing the CSV file to be Read */
	@Test
	public void testcensus() throws Exception {
		analyser.loadCensusData(
				"C:\\Users\\DELL\\eclipse-workspace\\Indian_State_Census_Analyser\\src\\com\\resources\\IndiaStateCensusData.csv");
		assertEquals(true, analyser.censusEntries());
	}

	/* Testing for throwing Exception for Invalid File Name */
	@Test
	public void testing_for_invalidfile() throws Exception {
		try {
			analyser.loadCensusData(
					"C:\\Users\\DELL\\eclipse-workspace\\Indian_State_Census_Analyser\\src\\com\\resources\\Invalidname_IndiaState.csv");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}