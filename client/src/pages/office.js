import { useState } from "react";
import Row from "react-bootstrap/Row";
import Col from "react-bootstrap/Col";

import Container from "react-bootstrap/Container";
import ListOffice from "../modules/list-offices/list-office.jsx";

import CreateOffice from "../modules/create-office/create-office.jsx";
import UpdateOffice from "../modules/update-office/update-office.jsx";

function Office() {
  const [showCreate, setShowCreate] = useState(false);
  const [showUpdate, setShowUpdate] = useState(false);
  const [officeId, setOfficeId] = useState(null);

  const handleCreateOffice = () => {
    setShowCreate(true);
  };

  const onCloseCreate = () => setShowCreate(false);

  const onCloseUpdate = () => setShowUpdate(false);

  const onCreated = (param) => {
    if (param) {
      setShowCreate(false);
    }
  };

  const onUpdated = (param) => {
    if (param) {
      setShowUpdate(false);
    }
  };

  const onItemUpdated = (id) => {
    if (id) {
      setOfficeId(id);
      setShowUpdate(true);
    }
  };

  return (
    <>
      <Container>
        <Row className="mt-4">
          <Col>
            <h2>Fiscalías</h2>
          </Col>
          <Col>
            <button
              type="button"
              class="btn btn-primary float-end"
              onClick={handleCreateOffice}
            >
              Agregar nueva
            </button>
          </Col>
        </Row>
        <br></br>
        <ListOffice onUpdated={onItemUpdated} />
      </Container>

      <CreateOffice
        show={showCreate}
        onClose={onCloseCreate}
        onCreated={onCreated}
      />
      <UpdateOffice
        show={showUpdate}
        onClose={onCloseUpdate}
        officeId={officeId}
        onUpdated={onUpdated}
      />
    </>
  );
}

export default Office;
