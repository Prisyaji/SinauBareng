// package com.praxis.management.model;

// import java.util.List;

// import javax.annotation.processing.Generated;
// import javax.persistence.Entity;
// import javax.persistence.Table;
// import javax.persistence.Id;
// import javax.persistence.GeneratedValue;
// import javax.persistence.GenerationType;
// import javax.persistence.Column;
// import javax.persistence.ManyToOne;
// import javax.persistence.FetchType;
// import javax.persistence.JoinColumn;
// import javax.persistence.OneToMany;
// import javax.persistence.CascadeType;


@Entity
@Table(name="Karya")
public class Karya {

    @Id
    // @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "idKarya")   
    private Long idKarya;

    private String linkYoutube;

    private String linkGithub;

    private String deskripsi;

    private String file;

    private String namaAnggota;

    public Long getId() {
        return idKarya;
    }

    public void setId(Long idKarya){
        this.idKarya = idKarya;
    }
    
    public String getLinkYoutube() {
        return linkYoutube;
    }

    public void setlinkYoutube(String linkYoutube){
        this.linkYoutube = linkYoutube;
    }

    public Long getLinkGithub() {
        return linkGithub;
    }

    public void setLinkGithub(String linkGithub){
        this.linkGithub = linkGithub;
    }

    public void setNamaAnggota(String namaAnggota){
        this.namaAnggota = namaAnggota;
    }
    public Long getNamaAnggota(){
        return namaAnggota;
    }
}
