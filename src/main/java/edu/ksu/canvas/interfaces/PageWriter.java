package edu.ksu.canvas.interfaces;

import java.util.Optional;

import edu.ksu.canvas.model.Page;

public interface PageWriter extends CanvasWriter<Page, PageWriter> {

    /**
     * Save a course page to Canvas
     * @param page The page object to save
     * @param courseId The Canvas course ID that this page is to be saved to
     * @return The update page after saving
     * @throws Exception
     */
    Optional<Page> updateCoursePage(Page page, Integer courseId) throws Exception;
}
