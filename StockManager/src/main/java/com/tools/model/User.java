package com.tools.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_USERS")
public class User {

	@Override
	public String toString() {
		return "User [id=" + id + ", _usrName=" + _usrName + ", _usrId=" + _usrId + ", _passwd=" + _passwd + "]";
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "NAME")
	private String _usrName;
	@Column(name = "USER_ID")
	private String _usrId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "PASSWD")
	private String _passwd;

	public String get_usrName() {
		return _usrName;
	}

	public String get_usrId() {
		return _usrId;
	}

	public void set_usrName(String _usrName) {
		this._usrName = _usrName;
	}

	public void set_usrId(String _usrId) {
		this._usrId = _usrId;
	}

	public String get_passwd() {
		return _passwd;
	}

	public void set_passwd(String _passwd) {
		this._passwd = _passwd;
	}

}
