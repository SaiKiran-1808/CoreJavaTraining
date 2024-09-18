package com.evergent.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.evergent.bean.LibraryBean;


public class LibraryDAO {

    public int addBook(LibraryBean book) {
        try (Connection con = LibraryDBConnection.getConnection()) {
            String query = "INSERT INTO library (book_id, title, author, total_copies, available_copies) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, book.getBookId());
            pstmt.setString(2, book.getBookTitle());
            pstmt.setString(3, book.getAuthorName());
            pstmt.setInt(4, book.getTotalCopies());
            pstmt.setInt(5, book.getAvailableCopies());
            return pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    public int issueBook(int bookId) {
        try (Connection con = LibraryDBConnection.getConnection()) {
            String query = "SELECT available_copies FROM library WHERE book_id=?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, bookId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next() && rs.getInt(1) > 0) {
                String updateQuery = "UPDATE library SET available_copies = available_copies - 1 WHERE book_id=?";
                pstmt = con.prepareStatement(updateQuery);
                pstmt.setInt(1, bookId);
                return pstmt.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int returnBook(int bookId) {
        try (Connection con = LibraryDBConnection.getConnection()) {
            String updateQuery = "UPDATE library SET available_copies = available_copies + 1 WHERE book_id=?";
            PreparedStatement pstmt = con.prepareStatement(updateQuery);
            pstmt.setInt(1, bookId);
            return pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public int getAvailableCopies(int bookId) {
        try (Connection con = LibraryDBConnection.getConnection()) {
            String query = "SELECT available_copies FROM library WHERE book_id=?";
            PreparedStatement pstmt = con.prepareStatement(query);
            pstmt.setInt(1, bookId);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}