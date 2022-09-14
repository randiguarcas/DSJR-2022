import { useEffect, useState } from "react";
import {
  findAll,
  del as deleteOffice,
} from "../../infra/repositories/office.js";

export default function useListOfficeModel() {
  const [offices, setOffices] = useState([]);

  useEffect(() => {
    async function find() {
      const response = await findAll();
      const mapper = await response.json();

      const availableOffices = mapper.filter(i => i.status === true);
      setOffices( availableOffices || []);
    }

    find();
  }, [setOffices]);

  const handleDeleteItem = async (id) => {
    const accepted = window.confirm(
      "¿Estás seguro que deseas eliminar este registro?"
    );
    if (accepted) {
      const response = await deleteOffice(id);
      await response.json();
    }
  };

  return {
    offices,
    handleDeleteItem,
  };
}
