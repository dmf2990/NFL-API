// api-actions -- getRequests, postRequests, putReq, deleteReq(fetch)

// only things unique to all getRequests (location and callback)
// location = is '/allTeams' in line 4 - gets data we want
// callback = function executed upon a successful data retrieval
function getRequest(location, callback) {
    fetch(location) 
      .then(response => response.json()) 
      .then(data => callback(data))
      .catch(err => console.log(err));
  }
  
  function postRequest(location, requestBody, callback) {
    fetch(location, {
      method: "POST",
      body: JSON.stringify(requestBody) //stringify takes in json object, makes string that can be passed back and forth
    }) 
      .then(response => response.json()) 
      .then(data => callback(data)) 
      .catch(err => console.log(err));
  }
  
  export default {
      getRequest,
      postRequest
  }; 






// export function deleteRequest(location, repository, callback) {
// fetch(location, {
//     method: "DELETE",
//     body: JSON.stringify(requestBody)
// })
//   .then(res => res.json())
//   .then(data => callback(data));
// }
