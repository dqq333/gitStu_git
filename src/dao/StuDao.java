package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Student;
import util.BaseDao;

public class StuDao extends BaseDao{
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	public List<Student> FindStu(){
		List<Student> list=new ArrayList<Student>();
		try {
			conn=getConnection();
			String sql="select*from informe";
			pst=conn.prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next()) {
				Student p=new Student(rs.getString("name"),rs.getInt("age"), rs.getString("sex"));
				list.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closeAll(rs,pst,conn);
		}
		
		return list;
	}
}
