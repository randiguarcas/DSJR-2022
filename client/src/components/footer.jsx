import React from "react";
import { useEffect } from "react";
import { useState } from "react";

function AppFooter() {
  const [year, setYear] = useState(null);

  useEffect(() => {
    setYear(new Date());
  }, [setYear]);

  return (
    <footer className="page-footer font-small blue pt-4">
      <div className="footer-copyright text-center py-3">
        © {year ? year.getFullYear() : ""}:
        <a href="https://github.com/randiguarcas"> Randi Guarcas</a>
      </div>
    </footer>
  );
}

export default AppFooter;
