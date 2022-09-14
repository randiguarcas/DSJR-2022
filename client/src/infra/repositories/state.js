const baseUrl = process.env.REACT_APP_API_URL;

const findAll = async () => {
  try {
    const response = await fetch(`${baseUrl}/api/states`);
    return response;
  } catch (e) {
    console.log(e);
  }
};

const findById = async (id) => {
  try {
    const response = await fetch(`${baseUrl}/api/states/${id}`);
    return response;
  } catch (e) {
    console.log(e);
  }
};

const create = async (body) => {
  try {
    const response = await fetch(`${baseUrl}/api/states`, {
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
    const response = await fetch(`${baseUrl}/api/states`, {
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
    const response = await fetch(`${baseUrl}/api/states/${id}`, {
      method: "DELETE",
    });
    return response;
  } catch (e) {
    console.log(e);
  }
};

export { findAll, findById, create, update, del };
