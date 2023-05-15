package controllers;

import dao.ArtistDao;
import dao.Artists;
import models.Artist;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/artists")
public class ArtistsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        List<Artist> artists = Artists.all();
//        req.setAttribute("artists", artists);
//        req.getRequestDispatcher("/artists/index.jsp").forward(req, resp);
        Artists artistsDao = new ArtistDao();
        List<Artist> artists = artistsDao.all();
        req.setAttribute("artists", artists);
        req.getRequestDispatcher("artists.jsp").forward(req, resp);
    }

}
