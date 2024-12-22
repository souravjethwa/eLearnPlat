import React, {useState, useEffect} from "react"
import axios from "axios"
import { useParams } from "react-router-dom";

const CourseDetail = () => {
    const [course, setCourse] = useState({});
    const { id } = useParams();
    
    useEffect(()=>{
        axios.get(`http://localhost:8080/api/courses/${id}`)
        .then(response =>  setCourse(response.data))
        .catch(error => console.error(error));
        },[id]);

    return(
        <>
            <h2>Detail description</h2>
            <h3>{course.id}</h3>
            <h3>{course.title}</h3>
            <h3>{course.description}</h3>
            <h3>{course.duration}</h3>
            <h3>{course.category}</h3>
            <h3>{course.price}</h3>
        </>
    )
};

export default CourseDetail;