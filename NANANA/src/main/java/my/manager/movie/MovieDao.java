package my.manager.movie;

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

public class MovieDao {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	private static MovieDao mdao;

	private MovieDao() {
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

	public static MovieDao getInstance() {
		if(mdao==null)
			mdao = new MovieDao();
		return mdao;
	}

	public ArrayList<MovieBean> getAllMovie(){
		ArrayList<MovieBean> mlist = new ArrayList<MovieBean>();
		String sql = "select * from movie order by mno";
		try {
			ps = conn.prepareStatement(sql);
			
			rs = ps.executeQuery();
			while(rs.next()) {
				MovieBean mb = new MovieBean();
				mb.setMno(rs.getInt("mno"));
				mb.setMname(rs.getString("mname"));
				mb.setPoster(rs.getString("poster"));
				mb.setGenre(rs.getString("genre"));
				mb.setRunning_time(rs.getInt("running_time"));
				mb.setMdate(String.valueOf(rs.getDate("mdate")));
				mb.setMage(rs.getInt("mage"));
				mb.setDirector(rs.getString("director"));
				mb.setActor(rs.getString("actor"));
				mb.setCountry(rs.getString("country"));
				mb.setReser_rate(rs.getDouble("reser_rate"));
				mb.setStar_rate(rs.getDouble("star_rate"));
				
				mlist.add(mb);
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
		return mlist;
	}

	public int insertMovie(MultipartRequest mr) {
		int cnt = -1;
		String sql = "insert into movie values(movie_seq.nextval,?,?,?,?,?,?,?,?,?,?,?)";
		try {
			String genre = "";
			String[] genre2 = mr.getParameterValues("genre");
			for(int i=0;i<genre2.length;i++) {
				genre += genre2[i] + " ";
 			}
			String poster = null;
			if(mr.getFilesystemName("poster") == null) {
				poster = "영화 포스터 없음";
			}
			else {
				poster = mr.getFilesystemName("poster");
			}
			
			ps = conn.prepareStatement(sql);
			ps.setString(1, mr.getParameter("mname"));
			ps.setString(2, poster);
			ps.setString(3, genre);
			ps.setInt(4, Integer.parseInt(mr.getParameter("running_time")));
			ps.setString(5, mr.getParameter("mdate"));
			ps.setInt(6, Integer.parseInt(mr.getParameter("mage")));
			ps.setString(7, mr.getParameter("director"));
			ps.setString(8, mr.getParameter("actor"));
			ps.setString(9, mr.getParameter("country"));
			ps.setDouble(10, Double.parseDouble(mr.getParameter("reser_rate")));
			ps.setDouble(11, Double.parseDouble(mr.getParameter("star_rate")));
			
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
	
	public int deleteMovie(int mno) {
		int cnt = -1;
		String sql = "delete movie where mno=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, mno);
			
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
	
	public MovieBean getMovieByMno(String mno) {
		MovieBean mb = new MovieBean();
		String sql = "select * from movie where mno=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, mno);
			
			rs = ps.executeQuery();
			if(rs.next()) {
				mb.setMno(rs.getInt("mno"));
				mb.setMname(rs.getString("mname"));
				mb.setPoster(rs.getString("poster"));
				mb.setGenre(rs.getString("genre"));
				mb.setRunning_time(rs.getInt("running_time"));
				mb.setMdate(String.valueOf(rs.getDate("mdate")));
				mb.setMage(rs.getInt("mage"));
				mb.setDirector(rs.getString("director"));
				mb.setActor(rs.getString("actor"));
				mb.setCountry(rs.getString("country"));
				mb.setReser_rate(rs.getDouble("reser_rate"));
				mb.setStar_rate(rs.getDouble("star_rate"));
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
		return mb;
	}
	
	public int updateMovie(MultipartRequest mr, String poster) {
		int cnt = -1;
		String sql = "update movie set mname=?,poster=?,genre=?,running_time=?,mdate=?,mage=?,director=?,actor=?,country=?,reser_rate=?,star_rate=? where mno=?";
		try {
			String genre = "";
			String[] genre2 = mr.getParameterValues("genre");
			for(int i=0;i<genre2.length;i++) {
				genre += genre2[i] + " ";
 			}
			ps = conn.prepareStatement(sql);
			ps.setString(1, mr.getParameter("mname"));
			ps.setString(2, poster);
			ps.setString(3, genre);
			ps.setInt(4, Integer.parseInt(mr.getParameter("running_time")));
			ps.setString(5, mr.getParameter("mdate"));
			ps.setInt(6, Integer.parseInt(mr.getParameter("mage")));
			ps.setString(7, mr.getParameter("director"));
			ps.setString(8, mr.getParameter("actor"));
			ps.setString(9, mr.getParameter("country"));
			ps.setDouble(10, Double.parseDouble(mr.getParameter("reser_rate")));
			ps.setDouble(11, Double.parseDouble(mr.getParameter("star_rate")));
			ps.setInt(12, Integer.parseInt(mr.getParameter("mno")));
			
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
	
}
