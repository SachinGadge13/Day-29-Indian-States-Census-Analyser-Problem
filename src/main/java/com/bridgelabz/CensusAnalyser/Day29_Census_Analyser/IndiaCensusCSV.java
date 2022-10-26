package com.bridgelabz.CensusAnalyser.Day29_Census_Analyser;

import com.opencsv.bean.CsvBindByName;

public class IndiaCensusCSV
{

	/*
	 * 1.Specifies a binding between a column name of the CSV input and a field in a bean.
	 */
    @CsvBindByName(column = "State", required = true)
    public String state;

    @CsvBindByName(column = "Population", required = true)
    public int population;

    @CsvBindByName(column = "AreaInSqKm", required = true)
    public int areaInAqKm;

    @CsvBindByName(column = "DensityPerSqKm", required = true)
    public int densityPerSqKm;

    /*
     * 2.to print method to diplay
     */
    @Override
    public String toString()
    {
        return "IndiaCensusCSV{" +
                "state='" + state + '\'' +
                ", population=" + population +
                ", areaInAqKm=" + areaInAqKm +
                ", densityPerSqKm=" + densityPerSqKm +
                '}';
    }
}