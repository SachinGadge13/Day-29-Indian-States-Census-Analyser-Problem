package com.bridgelabz.CensusAnalyser.Day29_Census_Analyser;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;


			/**
			 * 1. try catch to handle exception
			 * 2. to read the file path
			 * 3.class csvToBeanBuilder Class CsvToBeanBuilder<T> This class makes it
			 * 4.itrator to itrate every string value iteator dosent occupies memmory
			 * 5. has next to itrate to next string
			 * 6.to take a count in number format
			 * 7.enum exception type
			 *
			 *
			 */
			public class CensusAnalyzer {
				public int loadIndiaCensusData(String csvFilePath) throws CensusAnalyserException {
					/*
					 * 1. try catch to handle exception
					 */
					try {
						/*
						 * 2. to read the file path
						 */
						Reader reader = Files.newBufferedReader(Paths.get(csvFilePath));

						/*
						 * 3.class csvToBeanBuilder Class CsvToBeanBuilder<T> This class makes it
						 * possible to bypass all the intermediate steps and classes in setting up to
						 * read from a CSV source to a list of beans.
						 */
						CsvToBeanBuilder<IndiaCensusCSV> csvToBeanBuilder = new CsvToBeanBuilder<IndiaCensusCSV>(
								reader);
						csvToBeanBuilder.withType(IndiaCensusCSV.class);
						csvToBeanBuilder.withIgnoreLeadingWhiteSpace(true);
						CsvToBean<IndiaCensusCSV> csvToBean = csvToBeanBuilder.build();

						/*
						 * 4.itrator to itrate every string value iteator dosent occupies memmory
						 */
						Iterator<IndiaCensusCSV> censusCSVIterator = csvToBean.iterator();
						int numberOfEntries = 0;
						/**
						 * 5. has next to itrate to next string
						 */
						while (censusCSVIterator.hasNext()) {
							/*
							 * 6.to take a count in number format
							 */
							numberOfEntries++;
							IndiaCensusCSV censusData = censusCSVIterator.next();
						}
						return numberOfEntries;
					} catch (IOException e)
					/*
					 * 7.enum exception type
					 */
					{
						throw new CensusAnalyserException(e.getMessage(),
								CensusAnalyserException.ExceptionType.CENSUS_FILE_PROBLEM);
					} catch (RuntimeException e)

					{
						throw new CensusAnalyserException(e.getMessage(),
								CensusAnalyserException.ExceptionType.INVALID_FILE_TYPE_OR_DELIMITER_OR_HEADER);
					}
				}
				
				  public int loadIndiaStateCode(String csvFilePath) throws CensusAnalyserException
				    {
				        try
				        {
				            Reader reader = Files.newBufferedReader(Paths.get(csvFilePath));
				            CsvToBeanBuilder<IndiaStateCodeCSV> csvToBeanBuilder = new CsvToBeanBuilder<>(reader);
				            csvToBeanBuilder.withType(IndiaStateCodeCSV.class);
				            csvToBeanBuilder.withIgnoreLeadingWhiteSpace(true);
				            CsvToBean<IndiaStateCodeCSV> csvToBean = csvToBeanBuilder.build();

				            Iterator<IndiaStateCodeCSV> censusCSVIterator = csvToBean.iterator();
				            int numberOfEntries = 0;
				            while (censusCSVIterator.hasNext())
				            {
				                numberOfEntries++;
				                IndiaStateCodeCSV censusData = censusCSVIterator.next();
				            }
				            return numberOfEntries;
				        }
				        catch (IOException e)
				        {
				            throw new CensusAnalyserException(e.getMessage(),
				                    CensusAnalyserException.ExceptionType.CENSUS_FILE_PROBLEM);
				        }
				        catch (RuntimeException e)
				        {
				            throw new CensusAnalyserException(e.getMessage(),
				                    CensusAnalyserException.ExceptionType.INVALID_FILE_TYPE_OR_DELIMITER_OR_HEADER);
				        }
				    }
			}