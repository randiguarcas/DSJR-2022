import { useState, useEffect } from "react";
import { create as createOffice } from "../../infra/repositories/office.js";
import { findAll as findCities } from "../../infra/repositories/city.js";
import { findAll as findStates } from "../../infra/repositories/state.js";

export default function useCreateOfficeModel() {
  const [name, setName] = useState("");
  const [phone, setPhone] = useState("");
  const [extraPhone, setExtraPhone] = useState("");
  const [address, setAddress] = useState("");
  const [city, setCity] = useState("");
  const [cities, setCities] = useState([]);
  const [states, setStates] = useState([]);
  const [onStored, setOnStored] = useState(false);

  const handleName = ({ target }) => {
    setName(target.value);
  };

  const handlePhone = ({ target }) => {
    setPhone(target.value);
  };

  const handleExtraPhone = ({ target }) => {
    setExtraPhone(target.value);
  };

  const handleAddress = ({ target }) => {
    setAddress(target.value);
  };

  const handleCity = ({ target }) => {
    setCity(target.value);
  };

  const handleStoreForm = async () => {
    try {
      const response = await createOffice({
        name,
        phone,
        extraPhone,
        address,
        city
      });

      const mapper = await response.json();
      setOnStored(mapper);
    } catch(e) {
      console.log(e);
    }
  }

  useEffect(() => {
    async function findState() {
        const response = await findStates();
        const mapper = await response.json();
        setStates(mapper);
    }
    async function findCity() {
        const response = await findCities();
        const mapper = await response.json();
        setCities(mapper);
    }
    findState();
    findCity();
  }, [setStates, setCities]);

  return {
    handleName,
    handlePhone,
    handleExtraPhone,
    handleAddress,
    handleCity,
    handleStoreForm,
    cities,
    states,
    onStored
  };
}
