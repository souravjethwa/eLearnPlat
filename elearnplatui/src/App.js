import './App.css';
import {BrowserRouter as Router, Route, Routes} from "react-router-dom";
import CourseList from "./components/CourseList";
import CourseDetail from "./components/CourseDetail";
import UserRegistraton from './components/UserRegistration';
import Login from './components/Login';

const NotFound = () => <h2>Page Not Found</h2>;

function App() {
  return (
    <Router>
      <div>
        <Routes>
          <Route exact path = '/' element = {<Login/>} />
          <Route exact path = '/Registration' element = {<UserRegistraton/>} />
          <Route exact path = '/courses' element = {<CourseList/>} />
          <Route exact path = "/courses/:id" element = {<CourseDetail/>} />
          <Route Component = {NotFound} />
        </Routes>
      </div>
    </Router>
  );
}

export default App;
