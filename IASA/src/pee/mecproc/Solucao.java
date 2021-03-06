package pee.mecproc;

import java.util.Iterator;
import java.util.LinkedList;

import pee.modprob.Estado;

public class Solucao<E extends Estado> implements Iterable<No<E>> {
	
	private LinkedList<No<E>> percurso;
	private int numMaxNos;
	private int numNosExp;
	
	public Solucao() {
		this.percurso = new LinkedList<No<E>>();
	}
	
	@Override
	public Iterator<No<E>> iterator() {
		return percurso.iterator();
	}

	public void juntarInicio(No<E> no) {
		percurso.addFirst(no);
	}
	
	
	public void setNumMaxNos(int numMaxNos) {
		this.numMaxNos = numMaxNos;
	}
	
	public int getNumMaxNos() {
		return numMaxNos;
	}
	
	public void setNumNosExp(int numNosExp) {
		this.numNosExp = numNosExp;
	}
	
	public int getNumNosExp() {
		return numNosExp;
	}
}
