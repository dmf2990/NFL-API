//Event functions - bind event listeners
function on(element, eventType, callback) {
    element.addEventListener(eventType, (event) => callback(event))
  }

  // js module system
  export default {
      on
  }