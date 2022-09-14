import "bootstrap/dist/css/bootstrap.min.css";

import { Routes, Route } from "react-router-dom"
import Layout from "./components/layout.jsx";
import AppNavbar from "./components/navbar.jsx";
import AppFooter from "./components/footer.jsx";

import Office from "./pages/office.js";
import Country from "./pages/country.js";
import State from "./pages/state.js";
import City from "./pages/city.js";

function App() {
  return (
    <div className="App">
      <Layout>
        <AppNavbar />
          <Routes>
            <Route path="/" element={ <Office/> } />
            <Route path="/countries" element={ <Country/> } />
            <Route path="/states" element={ <State/> } />
            <Route path="/cities" element={ <City/> } />
          </Routes>
        <AppFooter />
      </Layout>
    </div>
  );
}

export default App;
