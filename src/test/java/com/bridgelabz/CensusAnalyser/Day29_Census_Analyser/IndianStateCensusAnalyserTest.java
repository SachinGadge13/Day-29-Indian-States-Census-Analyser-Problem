package com.bridgelabz.CensusAnalyser.Day29_Census_Analyser;
import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

import censuscsv.CensusAnalyserException;
import censuscsv.CensusAnalyzer;
import censuscsv.StateCensusCSV;

public class IndianStateCensusAnalyserTest {
    /**
     * File path
     */
	 private static final String INDIA_CENSUS_CSV_FILE_PATH= "C:\\Users\\shard\\eclipse-workspace\\Advance java"
			+ "\\IndianStateCensusAnalyserProblem\\IndianStateCensusAnalyserProblem\\src\\Resource\\IndiaStateCensusData.csv";
	
			
	  //Test Case 1.1
    @Test
    public void givenIndianCensusDataCSVFileReturnsCorrectRecords()
    {
        try
        {
            CensusAnalyzer censusAnalyser = new CensusAnalyzer();
            int numOfRecords = censusAnalyser.loadIndiaCensusData(INDIA_CENSUS_CSV_FILE_PATH);
            Assert.assertEquals(29,numOfRecords);
        }
        catch (CensusAnalyserException e) { }
    }
}