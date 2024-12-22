import React, {useState, useEffect} from "react"
import axios from "axios"
import { Link } from "react-router-dom";

const CourseList = () => {

    const [courses, setCourses] = useState([]);
    
    useEffect(() => {
        axios.get("http://localhost:8080/api/courses")
            .then(response => setCourses(response.data))
            .catch(error => console.error(error));
    },[] );


    return(
        <div> <h2>Available Courses</h2>
            <div>
                {courses.map(course => (
                    <div key={course.id}>
                        <h3>{course.title}</h3>
                        <p>{course.description}</p>
                        <Link to={`/courses/${course.id}`}>View Course</Link>
                    </div>
                ))}
            </div>
        </div>
        
    );
};

export default CourseList; 
