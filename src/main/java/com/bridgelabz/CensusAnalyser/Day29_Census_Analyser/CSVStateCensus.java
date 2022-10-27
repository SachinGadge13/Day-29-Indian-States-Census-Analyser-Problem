package com.bridgelabz.CensusAnalyser.Day29_Census_Analyser;

public class CSVStateCensus {
	private Integer sno;
	private String name;
	private String code;

	@Override
	public String toString() {
		return "[sno=" + sno + ", name=" + name + ", code=" + code + "]\n";
	}

	public Integer getSno() {
		return sno;
	}

	public void setSno(Integer sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}


}