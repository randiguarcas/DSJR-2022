const baseUrl = process.env.REACT_APP_API_URL;

const findAll = async () => {
  try {
    const response = await fetch(`${baseUrl}/api/offices`);
    return response;
  } catch (e) {
    console.log(e);
  }
};

const findById = async (id) => {
  try {
    const response = await fetch(`${baseUrl}/api/offices/${id}`);
    return response;
  } catch (e) {
    console.log(e);
  }
};

const create = async (body) => {
  try {
    const response = await fetch(`${baseUrl}/api/offices`, {
      method: "POST",
      body: JSON.stringify(body),
      headers: {
        "Content-Type": "application/json",
      },
    });
    return response;
  } catch (e) {
    console.log(e);
  }
};

const update = async (body) => {
  try {
    const response = await fetch(`${baseUrl}/api/offices`, {
      method: "PUT",
      body: JSON.stringify(body),
      headers: {
        "Content-Type": "application/json",
      },
    });
    return response;
  } catch (e) {
    console.log(e);
  }
};

const del = async (id) => {
  try {
    const response = await fetch(`${baseUrl}/api/offices/${id}`, {
      method: "DELETE",
    });
    return response;
  } catch (e) {
    console.log(e);
  }
};

export { findAll, findById, create, update, del };
