package com.maulanakurnia.responsi.data.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class KumulatifHarian {

	private int statusCode;

	@SerializedName("data")
	@Expose
	private KumulatifHarian.Data data;
	public KumulatifHarian.Data getData() {
		return data;
	}

	public static class Data {
		private Object metadata;
		private ArrayList<KumulatifHarian.Data.Content> content;
		public ArrayList<KumulatifHarian.Data.Content> getContent() { return content;}
		public Object getMetadata() {
			return metadata;
		}

		public void setMetadata(Object metadata) {
			this.metadata = metadata;
		}

		public static class Content {
			private String tanggal;
			private String kode_prov;
			private String nama_prov;
			@SerializedName("SUSPECT")
			private int suspect;
			private int suspect_diisolasi;
			private int suspect_discarded;
			@SerializedName("CLOSECONTACT")
			private int close_contact;
			private int closecontact_dikarantina;
			private int closecontact_discarded;
			private int probable_discarded;
			private int probable_diisolasi;
			private int probable_meninggal;
			@SerializedName("CONFIRMATION")
			private int confirmation;
			private int confirmation_diisolasi;
			private int confirmation_selesai;
			private int confirmation_meninggal;
			private int suspect_meninggal_harian;
			private int closecontact_meninggal_harian;


			public String getTanggal() {
				return tanggal;
			}

			public String getKode_prov() {
				return kode_prov;
			}

			public String getNama_prov() {
				return nama_prov;
			}

			public int getSuspect() {
				return suspect;
			}

			public int getSuspect_diisolasi() {
				return suspect_diisolasi;
			}

			public int getSuspect_discarded() {
				return suspect_discarded;
			}

			public int getClose_contact() {
				return close_contact;
			}

			public int getClosecontact_dikarantina() {
				return closecontact_dikarantina;
			}

			public int getClosecontact_discarded() {
				return closecontact_discarded;
			}

			public int getProbable_discarded() {
				return probable_discarded;
			}

			public int getProbable_diisolasi() {
				return probable_diisolasi;
			}

			public int getProbable_meninggal() {
				return probable_meninggal;
			}

			public int getConfirmation() {
				return confirmation;
			}

			public int getConfirmation_diisolasi() {
				return confirmation_diisolasi;
			}

			public int getConfirmation_selesai() {
				return confirmation_selesai;
			}

			public int getConfirmation_meninggal() {
				return confirmation_meninggal;
			}

			public int getSuspect_meninggal_harian() {
				return suspect_meninggal_harian;
			}

			public int getClosecontact_meninggal_harian() {
				return closecontact_meninggal_harian;
			}

			public void setTanggal(String tanggal) {
				this.tanggal = tanggal;
			}

			public void setKode_prov(String kode_prov) {
				this.kode_prov = kode_prov;
			}

			public void setNama_prov(String nama_prov) {
				this.nama_prov = nama_prov;
			}

			public void setSuspect(int suspect) {
				this.suspect = suspect;
			}

			public void setSuspect_diisolasi(int suspect_diisolasi) {
				this.suspect_diisolasi = suspect_diisolasi;
			}

			public void setSuspect_discarded(int suspect_discarded) {
				this.suspect_discarded = suspect_discarded;
			}

			public void setClose_contact(int close_contact) {
				this.close_contact = close_contact;
			}

			public void setClosecontact_dikarantina(int closecontact_dikarantina) {
				this.closecontact_dikarantina = closecontact_dikarantina;
			}

			public void setClosecontact_discarded(int closecontact_discarded) {
				this.closecontact_discarded = closecontact_discarded;
			}

			public void setProbable_discarded(int probable_discarded) {
				this.probable_discarded = probable_discarded;
			}

			public void setProbable_diisolasi(int probable_diisolasi) {
				this.probable_diisolasi = probable_diisolasi;
			}

			public void setProbable_meninggal(int probable_meninggal) {
				this.probable_meninggal = probable_meninggal;
			}

			public void setConfirmation(int confirmation) {
				this.confirmation = confirmation;
			}

			public void setConfirmation_diisolasi(int confirmation_diisolasi) {
				this.confirmation_diisolasi = confirmation_diisolasi;
			}

			public void setConfirmation_selesai(int confirmation_selesai) {
				this.confirmation_selesai = confirmation_selesai;
			}

			public void setConfirmation_meninggal(int confirmation_meninggal) {
				this.confirmation_meninggal = confirmation_meninggal;
			}

			public void setSuspect_meninggal_harian(int suspect_meninggal_harian) {
				this.suspect_meninggal_harian = suspect_meninggal_harian;
			}

			public void setClosecontact_meninggal_harian(int closecontact_meninggal_harian) {
				this.closecontact_meninggal_harian = closecontact_meninggal_harian;
			}
		}
	}
}
