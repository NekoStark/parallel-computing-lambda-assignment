package it.unifi.parallel.storm_images.model;

public class ImageResult {

	private String link;
	private String searchKey;
	private String service;
	private String timestamp;
	
	public ImageResult(String input) {
		String[] split = input.split("\t");
		this.link = split[0];
		this.searchKey = split[1];
		this.service = split[2];
		this.timestamp = split[3];
	}
	
	public String getLink() {
		return link;
	}
	public String getSearchKey() {
		return searchKey;
	}
	public String getService() {
		return service;
	}
	public String getTimestamp() {
		return timestamp;
	}
	
}
