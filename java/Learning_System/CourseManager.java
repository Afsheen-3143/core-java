package LearningSystem;

import java.sql.*;

public class CourseManager {

    // --------Subject Area--------
    public void addSubject(int id, String name) {
        try (Connection con = DatabaseConnection.getConnection()) {
            String sql = "INSERT INTO SubjectArea(subject_id, subject_name) VALUES(?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, name);
            int rows = ps.executeUpdate();
            System.out.println("SubjectArea added successfully. Rows affected = " + rows);
        } catch (SQLException e) {
            System.out.println("Error adding subject: " + e.getMessage());
        }
    }

    public void updateSubject(String newName, int id) {
        try (Connection con = DatabaseConnection.getConnection()) {
            String sql = "UPDATE SubjectArea SET subject_name=? WHERE subject_id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, newName);
            ps.setInt(2, id);
            int rows = ps.executeUpdate();
            System.out.println("SubjectArea updated. Rows affected = " + rows);
        } catch (SQLException e) {
            System.out.println("Error updating subject: " + e.getMessage());
        }
    }

    public void deleteSubject(int id) {
        try (Connection con = DatabaseConnection.getConnection()) {
            String sql = "DELETE FROM SubjectArea WHERE subject_id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("SubjectArea deleted successfully. Rows affected = " + rows);
            } else {
                System.out.println("No SubjectArea found with ID.");
            }
        } catch (SQLException e) {
            System.out.println("Error deleting subject: " + e.getMessage());
        }
    }

    public void viewSubjects() {
        try (Connection con = DatabaseConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM SubjectArea ORDER BY subject_id")) {
            while (rs.next()) {
                System.out.println("SubjectArea [ID=" + rs.getInt("subject_id") +
                        ", Name=" + rs.getString("subject_name") + "]");
            }
        } catch (SQLException e) {
            System.out.println("Error retrieving subjects: " + e.getMessage());
        }
    }


    // --------Course--------
    public void addCourse(int id, String name, int subjectId) {
        try (Connection con = DatabaseConnection.getConnection()) {
            String sql = "INSERT INTO Course(course_id, course_name, subject_id) VALUES(?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, subjectId);
            int rows = ps.executeUpdate();
            System.out.println("Course added. Rows affected = " + rows);
        } catch (SQLException e) {
            System.out.println("Error adding Course: " + e.getMessage());
        }
    }

    public void updateCourse(String newName, int id) {
        try (Connection con = DatabaseConnection.getConnection()) {
            String sql = "UPDATE Course SET course_name=? WHERE course_id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, newName);
            ps.setInt(2, id);
            int rows = ps.executeUpdate();
            System.out.println("Course updated. Rows affected = " + rows);
        } catch (SQLException e) {
            System.out.println("Error updating Course: " + e.getMessage());
        }
    }

    public void deleteCourse(int id) {
        try (Connection con = DatabaseConnection.getConnection()) {
            String sql = "DELETE FROM Course WHERE course_id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Course deleted successfully. Rows affected = " + rows);
            } else {
                System.out.println("No Course found with ID.");
            }
        } catch (SQLException e) {
            System.out.println("Error deleting Course: " + e.getMessage());
        }
    }

    public void viewCourses() {
        try (Connection con = DatabaseConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM Course ORDER BY course_id")) {
            while (rs.next()) {
                System.out.println("Course [ID=" + rs.getInt("course_id") +
                        ", Name=" + rs.getString("course_name") +
                        ", SubjectID=" + rs.getInt("subject_id") + "]");
            }
        } catch (SQLException e) {
            System.out.println("Error retrieving Courses: " + e.getMessage());
        }
    }


    // --------Chapter--------
    public void addChapter(int id, String name, int courseId) {
        try (Connection con = DatabaseConnection.getConnection()) {
            String sql = "INSERT INTO Chapter(chapter_id, chapter_name, course_id) VALUES(?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, courseId);
            int rows = ps.executeUpdate();
            System.out.println("Chapter added. Rows affected = " + rows);
        } catch (SQLException e) {
            System.out.println("Error adding Chapter: " + e.getMessage());
        }
    }

    public void updateChapter(String newName, int id) {
        try (Connection con = DatabaseConnection.getConnection()) {
            String sql = "UPDATE Chapter SET chapter_name=? WHERE chapter_id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, newName);
            ps.setInt(2, id);
            int rows = ps.executeUpdate();
            System.out.println("Chapter updated. Rows affected = " + rows);
        } catch (SQLException e) {
            System.out.println("Error updating Chapter: " + e.getMessage());
        }
    }

    public void deleteChapter(int id) {
        try (Connection con = DatabaseConnection.getConnection()) {
            String sql = "DELETE FROM Chapter WHERE chapter_id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Chapter deleted successfully. Rows affected = " + rows);
            } else {
                System.out.println("No Chapter found with ID.");
            }
        } catch (SQLException e) {
            System.out.println("Error deleting Chapter: " + e.getMessage());
        }
    }

    public void viewChapters() {
        try (Connection con = DatabaseConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM Chapter ORDER BY chapter_id")) {
            while (rs.next()) {
                System.out.println("Chapter [ID=" + rs.getInt("chapter_id") +
                        ", Name=" + rs.getString("chapter_name") +
                        ", CourseID=" + rs.getInt("course_id") + "]");
            }
        } catch (SQLException e) {
            System.out.println("Error retrieving Chapters: " + e.getMessage());
        }
    }


    // --------Topic--------
    public void addTopic(int id, String name, int chapterId) {
        try (Connection con = DatabaseConnection.getConnection()) {
            String sql = "INSERT INTO Topic(topic_id, topic_name, chapter_id) VALUES(?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setInt(3, chapterId);
            int rows = ps.executeUpdate();
            System.out.println("Topic added. Rows affected = " + rows);
        } catch (SQLException e) {
            System.out.println("Error adding Topic: " + e.getMessage());
        }
    }

    public void updateTopic(String newName, int id) {
        try (Connection con = DatabaseConnection.getConnection()) {
            String sql = "UPDATE Topic SET topic_name=? WHERE topic_id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, newName);
            ps.setInt(2, id);
            int rows = ps.executeUpdate();
            System.out.println("Topic updated. Rows affected = " + rows);
        } catch (SQLException e) {
            System.out.println("Error updating Topic: " + e.getMessage());
        }
    }

    public void deleteTopic(int id) {
        try (Connection con = DatabaseConnection.getConnection()) {
            String sql = "DELETE FROM Topic WHERE topic_id=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Topic deleted successfully. Rows affected = " + rows);
            } else {
                System.out.println("No Topic found with ID.");
            }
        } catch (SQLException e) {
            System.out.println("Error deleting Topic: " + e.getMessage());
        }
    }

    public void viewTopics() {
        try (Connection con = DatabaseConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery("SELECT * FROM Topic ORDER BY topic_id")) {
            while (rs.next()) {
                System.out.println("Topic [ID=" + rs.getInt("topic_id") +
                        ", Name=" + rs.getString("topic_name") +
                        ", ChapterID=" + rs.getInt("chapter_id") + "]");
            }
        } catch (SQLException e) {
            System.out.println("Error retrieving Topics: " + e.getMessage());
        }
    }
}
