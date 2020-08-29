

exports.handler = async (event) => {
    console.log(event);
    const author = {
        id: 2,
        name: "author 2",
    };

    return author;
};
