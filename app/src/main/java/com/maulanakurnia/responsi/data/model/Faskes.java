package com.maulanakurnia.responsi.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Faskes {
	private int statusCode;
	@SerializedName("data")
	@Expose
	private ArrayList<Faskes.Data> data;
	public ArrayList<Faskes.Data> getData() {
		return data;
	}

	public static class Data {
		private Object rujukan;
		private String nama;
		private int tipeFaskes;
		private double latitude;
		private String telepon;
		private Object kodeKemkes;
		private Object url;
		private String alamat;
		private double longitude;
		private int nomorRujukan;

		public Object getRujukan(){
			return rujukan;
		}

		public String getNama(){
			return nama;
		}

		public int getTipeFaskes(){
			return tipeFaskes;
		}

		public double getLatitude(){
			return latitude;
		}

		public String getTelepon(){
			return telepon;
		}

		public Object getKodeKemkes(){
			return kodeKemkes;
		}

		public Object getUrl(){
			return url;
		}

		public String getAlamat(){
			return alamat;
		}

		public double getLongitude(){
			return longitude;
		}

		public int getNomorRujukan(){
			return nomorRujukan;
		}

		public void setRujukan(Object rujukan) {
			this.rujukan = rujukan;
		}

		public void setNama(String nama) {
			this.nama = nama;
		}

		public void setTipeFaskes(int tipeFaskes) {
			this.tipeFaskes = tipeFaskes;
		}

		public void setLatitude(double latitude) {
			this.latitude = latitude;
		}

		public void setTelepon(String telepon) {
			this.telepon = telepon;
		}

		public void setKodeKemkes(Object kodeKemkes) {
			this.kodeKemkes = kodeKemkes;
		}

		public void setUrl(Object url) {
			this.url = url;
		}

		public void setAlamat(String alamat) {
			this.alamat = alamat;
		}

		public void setLongitude(double longitude) {
			this.longitude = longitude;
		}

		public void setNomorRujukan(int nomorRujukan) {
			this.nomorRujukan = nomorRujukan;
		}
	}
}
