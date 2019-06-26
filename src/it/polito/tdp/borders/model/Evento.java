package it.polito.tdp.borders.model;

public class Evento implements Comparable<Evento>{
	//istante di tempo 
	private int t;
	//numero di persone che sono arrivate e si spostano 
	private int n;
	//il paese in cui arrivano e da cui si sposteranno
	private Country stato;
	public Evento(int t, int n, Country stato) {
		super();
		this.t = t;
		this.n = n;
		this.stato = stato;
	}
	public int getT() {
		return t;
	}
	public int getN() {
		return n;
	}
	public Country getStato() {
		return stato;
	}
	@Override
	public int compareTo(Evento o) {
		// TODO Auto-generated method stub
		return this.t-o.t;
	}
	
	

}
