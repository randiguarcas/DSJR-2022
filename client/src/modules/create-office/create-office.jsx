import React, { useEffect } from "react";
import Button from "react-bootstrap/Button";
import Modal from "react-bootstrap/Modal";
import Form from "react-bootstrap/Form";

import useCreateOfficeModel from "./create-office.model.js";

function CreateOffice({ show, onClose, onCreated }) {
  const handleClose = () => onClose();
  const {
    handleName,
    handlePhone,
    handleExtraPhone,
    handleAddress,
    handleCity,
    handleStoreForm,
    states,
    cities,
    onStored,
  } = useCreateOfficeModel();

  useEffect(() => {
    onCreated(onStored);
  }, [onStored]);
  return (
    <>
      <Modal show={show} onHide={handleClose}>
        <Modal.Header closeButton>
          <Modal.Title>Nueva Fiscalía</Modal.Title>
        </Modal.Header>
        <Modal.Body>
          <Form>
            <Form.Group>
              <Form.Label htmlFor="name">Nombre</Form.Label>
              <Form.Control
                type="text"
                id="name"
                aria-describedby="Office name"
                onChange={handleName}
              />
            </Form.Group>
            <Form.Group className="mt-2">
              <Form.Label htmlFor="name">Teléfono</Form.Label>
              <Form.Control
                type="text"
                id="name"
                aria-describedby="Office name"
                onChange={handlePhone}
              />
            </Form.Group>
            <Form.Group className="mt-2">
              <Form.Label htmlFor="name" className="mt-2">
                Teléfono extra
              </Form.Label>
              <Form.Control
                type="text"
                id="name"
                aria-describedby="Office name"
                onChange={handleExtraPhone}
              />
            </Form.Group>
            <Form.Group className="mt-2">
              <Form.Label htmlFor="name" className="mt-2">
                Dirección
              </Form.Label>
              <Form.Control
                type="text"
                id="name"
                onChange={handleAddress}
                aria-describedby="Office name"
              />
            </Form.Group>
            <Form.Group className="mb-3 mt-3">
              <Form.Label htmlFor="disabledSelect">Departamento</Form.Label>
              <Form.Select id="disabledSelect">
                {states.length
                  ? states.map((i) => (
                      <option key={i.id} value={i.id}>
                        {i.name}
                      </option>
                    ))
                  : null}
              </Form.Select>
            </Form.Group>
            <Form.Group className="mb-3 mt-3">
              <Form.Label htmlFor="disabledSelect">Municipio</Form.Label>
              <Form.Select id="disabledSelect" onChange={handleCity}>
                {cities.length
                  ? cities.map((i) => (
                      <option key={i.id} value={i.id}>
                        {i.name}
                      </option>
                    ))
                  : null}
              </Form.Select>
            </Form.Group>
            <Button
              className="mt-2"
              variant="primary"
              onClick={handleStoreForm}
            >
              Guardar
            </Button>
          </Form>
        </Modal.Body>
      </Modal>
    </>
  );
}

export default CreateOffice;
