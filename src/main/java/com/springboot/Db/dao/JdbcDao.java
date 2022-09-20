package com.springboot.Db.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.springboot.Db.bean.Person;


@Repository
public class JdbcDao {

	@Autowired
	JdbcTemplate jdbctemp;
	
	
	class PersonRowMapper implements RowMapper<Person>{

		@Override
		public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			Person p=new Person();
			p.setId(rs.getInt("id"));
			p.setName(rs.getString("name"));
			p.setLocation(rs.getString("location"));
			p.setBirthdate(rs.getDate("birth_date"));

			return p;
		}
		
	}
	
	public List<Person> find(){
		return jdbctemp.query("select * from person", new PersonRowMapper());
	}
	
//	public List<Person> findall(){
//		return jdbctemp.query("select * from person", new BeanPropertyRowMapper<Person>(Person.class));
//		-->Default rowmapper provided by spring jdbc
//	}
}
