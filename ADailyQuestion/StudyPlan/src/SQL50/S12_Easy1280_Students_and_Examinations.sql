# Link: https://leetcode.com/problems/students-and-examinations/description/
# 1280. Students and Examinations

# Write your MySQL query statement below
SELECT st.student_id, st.student_name, sb.subject_name, COUNT(ex.student_id) attended_exams
FROM Students st CROSS JOIN Subjects sb LEFT JOIN Examinations ex
ON st.student_id = ex.student_id
AND sb.subject_name = ex.subject_name
GROUP BY st.student_id, st.student_name, sb.subject_name
ORDER BY st.student_id, st.student_name, sb.subject_name;