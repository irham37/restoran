package models;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import play.db.jpa.Model;
@Entity
public class orang extends Model {
	public String nama ;
	public String Alamat;
	public String kontak;
	public String user ;
	public String pass ;
	@OneToMany
	public hakakses hak ;
	@OneToOne 
	public jeniskelamin jk;

}
