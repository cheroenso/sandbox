package com.cwb.request;

class ResultBean {
	private int exitValue;
	private String stdout;
	private String stderr;
	private String outFileMd5;
	private String errorMsg;
	
	public ResultBean(){
		exitValue = 0;
		stdout = "";
		stderr = "";
		outFileMd5 = "";
		errorMsg = "";
	}

	public int getExitValue() {
		return exitValue;
	}

	public void setExitValue(int exitValue) {
		this.exitValue = exitValue;
	}

	public String getStdout() {
		return stdout;
	}

	public void setStdout(String stdout) {
		this.stdout = stdout;
	}

	public String getStderr() {
		return stderr;
	}

	public void setStderr(String stderr) {
		this.stderr = stderr;
	}

	public String getOutFileMd5() {
		return outFileMd5;
	}

	public void setOutFileMd5(String outFileMd5) {
		this.outFileMd5 = outFileMd5;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

}