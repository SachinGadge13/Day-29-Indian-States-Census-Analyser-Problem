package com.bridgelabz.CensusAnalyser.Day29_Census_Analyser;
public class CensusAnalyserException extends Exception
{

	/*
	 * 1.enum class constant
	 */
  public enum ExceptionType
    {
        CENSUS_FILE_PROBLEM,
        INVALID_FILE_TYPE_OR_DELIMITER_OR_HEADER,
    }

    public ExceptionType type;
    public CensusAnalyserException(String message, ExceptionType type)
    {
        super(message);
        this.type = type;
    }


    public CensusAnalyserException(String message, ExceptionType type, Throwable cause)
    {
        super(message, cause);
        this.type = type;
    }
}