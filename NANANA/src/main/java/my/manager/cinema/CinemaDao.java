package my.manager.cinema;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.oreilly.servlet.MultipartRequest;

public class CinemaDao {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	private static CinemaDao cdao;

	private CinemaDao() {
		Context initContext;
		try {
			initContext = new InitialContext();
			Context envContext = (Context)initContext.lookup("java:comp/env");
			DataSource ds = (DataSource)envContext.lookup("jdbc/OracleDB");
			conn = ds.getConnection();

		} catch (NamingException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static CinemaDao getInstance() {
		if(cdao==null)
			cdao = new CinemaDao();
		return cdao;
	}

	public ArrayList<CinemaBean> getAllCinema(){
		ArrayList<CinemaBean> clist = new ArrayList<CinemaBean>();
		String sql = "select * from cinema order by cno";
		try {
			ps = conn.prepareStatement(sql);
			
			rs = ps.executeQuery();
			while(rs.next()) {
				CinemaBean cb = new CinemaBean();
				cb.setCno(rs.getInt("cno"));
				cb.setCname(rs.getString("cname"));
				cb.setSeat(rs.getInt("seat"));
				cb.setAddress(rs.getString("address"));
				cb.setTel1(rs.getInt("tel1"));
				cb.setTel2(rs.getInt("tel2"));
				
				clist.add(cb);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ps != null) {
					ps.close();
				}
				if(rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return clist;
	}
	
	public int insertCinama(CinemaBean cb) {
		int cnt = -1;
		String sql = "insert into cinema values(cinema_seq.nextval,?,?,?,?,?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, cb.getCname());
			ps.setInt(2, cb.getSeat());
			ps.setString(3, cb.getAddress());
			ps.setInt(4, cb.getTel1());
			ps.setInt(5, cb.getTel2());
			
			cnt = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ps != null) {
					ps.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return cnt;
	}
	
	public int deleteCinama(String cno) {
		int cnt = -1;
		String sql = "delete cinema where cno=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, cno);
			
			cnt = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ps != null) {
					ps.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return cnt;
	}
	
	public CinemaBean getCinemaByCno(String cno) {
		CinemaBean cb = null;
		String sql = "select * from cinema where cno=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, cno);
			
			rs = ps.executeQuery();
			if(rs.next()) {
				cb = new CinemaBean();
				cb.setCno(rs.getInt("cno"));
				cb.setCname(rs.getString("cname"));
				cb.setSeat(rs.getInt("seat"));
				cb.setAddress(rs.getString("address"));
				cb.setTel1(rs.getInt("tel1"));
				cb.setTel2(rs.getInt("tel2"));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ps != null) {
					ps.close();
				}
				if(rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return cb;
	}
	
	public int updateCinama(CinemaBean cb) {
		int cnt = -1;
		String sql = "update cinema set cname=?, seat=?, address=?, tel1=?, tel2=? where cno=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, cb.getCname());
			ps.setInt(2, cb.getSeat());
			ps.setString(3, cb.getAddress());
			ps.setInt(4, cb.getTel1());
			ps.setInt(5, cb.getTel2());
			ps.setInt(6, cb.getCno());
			
			cnt = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ps != null) {
					ps.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return cnt;
	}
	
	public int getSeatByCname(String cname) {
		int seat_capa = 0;
		String sql = "select * from cinema where cname=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, cname);
			
			rs = ps.executeQuery();
			if(rs.next()) {
				seat_capa = rs.getInt("seat");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(ps != null) {
					ps.close();
				}
				if(rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return seat_capa;
	}
	
}
