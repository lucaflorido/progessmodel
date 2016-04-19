package it.progess.model;

import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="PrintDocument")
public class PrintDocument {
	private PrintHead head;
	private Set<PrintRow> rows;
	private PrintFoot foot;
	public PrintHead getHead() {
		return head;
	}
	public void setHead(PrintHead head) {
		this.head = head;
	}
	public Set<PrintRow> getRows() {
		return rows;
	}
	public void setRows(Set<PrintRow> rows) {
		this.rows = rows;
	}
	public PrintFoot getFoot() {
		return foot;
	}
	public void setFoot(PrintFoot foot) {
		this.foot = foot;
	}
	
}
