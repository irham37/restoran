package models;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import play.db.jpa.Model;
@Entity
public class menu extends Model {
	public String namamenu;
	@OneToOne
	public status status;
	public double harga;
	public String keterangan ;
	@ManyToOne
	public kategoriMenu ktMenu ;
	@OneToMany
	public bahan bahan ;
	@ManyToMany
	public orang orang;
}
