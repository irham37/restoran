package models;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import play.db.jpa.Model;
@Entity
public class pesanan extends Model{
	public String status;
	@ManyToOne
	public nomeja nomeja ;
	public Date tgl ;
	public int jumlah ;
	public Double total ;
	@ManyToOne
	public menu menu ;
	@OneToMany 
	public orang orang;
}
