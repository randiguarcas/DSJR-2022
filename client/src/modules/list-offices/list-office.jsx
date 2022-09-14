import Row from "react-bootstrap/Row";
import Col from "react-bootstrap/Col";
import useListOfficeModel from "./list-office.model.js";

function ListOffice({ onUpdated }) {
  const { offices, handleDeleteItem } = useListOfficeModel();

  const handleEditItem = (id) => {
    onUpdated(id);
  };


  return (
    <Row>
      {offices.length
        ? offices.map((office) => {
            return (
              <Col>
                <div
                  className="card mt-2"
                  style={{
                    width: "16rem",
                  }}
                >
                  <img
                    className="card-img-top"
                    src="https://placeimg.com/286/180/arch"
                    alt={office.name}
                  />
                  <div className="card-body">
                    <h5 className="card-title">{office.name}</h5>
                    <p className="card-text" style={{ fontSize: "12px" }}>
                      Tel: {office.phone}{" "}
                      {office.extraPhone ? `,${office.extraPhone}` : ""}
                    </p>
                    <p className="card-text" style={{ fontSize: "12px" }}>
                      Dirección: {office.address}
                    </p>
                    <div style={{ fontSize: "12px" }}>
                      <a href="#" className="text-primary"
                        onClick={() => handleEditItem(office.id)}
                      >
                        Editar
                      </a>
                      &nbsp;&nbsp;&nbsp;&nbsp;
                      <a href="#" className="text-danger" onClick={() => handleDeleteItem(office.id)}>
                        Eliminar
                      </a>
                    </div>
                  </div>
                </div>
              </Col>
            );
          })
        : null}
    </Row>
  );
}

export default ListOffice;
