function headerReduce(state = {}, action) {
    if (action.type == "header") {
        return {
            ...action.data
        }
    }
    return state;
}

let CommonReduce = {
    header: headerReduce
}

export default CommonReduce;
