/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidade;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author 0070149
 */
public class Doador implements Serializable {
    
    private static long serialVersionUID = -309513637403441918L;

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @param aSerialVersionUID the serialVersionUID to set
     */
    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }
 
	private String nome;
 
	private Long cpf;
 
	private String email;
 
	private Date dataNascimento;
        
        private String sexo;
        
        private String logradouro;
        
        private Long numero;
        
        private Long complemento;
        
        private String cep;
        
        private String telefone;
         
 
	public Doador() {}
 
	public Doador(Long cpf) {
		super();
		this.cpf = cpf;
	}
        
	public Doador(Long cpf, String nome) {
		super();
		this.cpf = cpf;
		this.nome = nome;
	}

     

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the cpf
     */
    public Long getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the dataNascimento
     */
    public Date getDataNascimento() {
        return dataNascimento;
    }

    /**
     * @param dataNascimento the dataNascimento to set
     */
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the logradouro
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * @param logradouro the logradouro to set
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    /**
     * @return the numero
     */
    public Long getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(Long numero) {
        this.numero = numero;
    }

    /**
     * @return the complemento
     */
    public Long getComplemento() {
        return complemento;
    }

    /**
     * @param complemento the complemento to set
     */
    public void setComplemento(Long complemento) {
        this.complemento = complemento;
    }

    /**
     * @return the cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * @param cep the cep to set
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    



@Override
	 public String toString() {
		return "Doador [nome=" + getNome() 
                        + ", cpf=" + getCpf() 
                        + ", email=" + getEmail() 
                        + ", dataNascimento=" + getDataNascimento() 
                        + ", sexo=" + getSexo() 
                        + ", logradouro=" + getLogradouro() 
                        + ", numero=" + getNumero() 
                        + ", complemento=" + getComplemento() 
                        + ", cep=" + getCep() 
                        + ", telefone=" + getTelefone() + "]";
	}
         
}