package com.generate.link.generate_link.generate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
public class link_table {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "input_link", nullable = false)
	private String inputLink;
	@Column(name = "output_link", nullable = false)
	private String outputLink;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getinputLink() {
		return inputLink;
	}
	public void setinputLink(String inputLink) {
		this.inputLink = inputLink;
	}
	public String getOutput_link() {
		return outputLink;
	}
	public void setOutput_link(String output_link) {
		this.outputLink = output_link;
	}
	public link_table(int id, String inputLink, String output_link) {
		this.id = id;
		this.inputLink = inputLink;
		this.outputLink = output_link;
	}
	
	public link_table(String inputLink, String output_link) {

		this.inputLink = inputLink;
		this.outputLink = output_link;
	}
	
	public link_table() {
	}
	
	@Override
	public String toString() {
		return "generate [id=" + id + ", inputLink=" + inputLink + ", output_link=" + outputLink + "]";
	}
	
	
	
}
