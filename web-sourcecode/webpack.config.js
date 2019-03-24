var path = require('path');
 
module.exports = {
    entry: {
            index:path.resolve(__dirname, './src/index')
        },
    output: {
        path: path.resolve(__dirname, '../web/web-inf/js'),
        filename: '[name].js'
    },
 
    module: {
        //加载器配置
        rules: [
            { 
                loader: 'babel-loader',
                exclude:[
                    path.resolve(__dirname,'node_modules')
                ],
                include:[
                    path.resolve(__dirname,'src')
                ],
                test:/\.js$/,
                query:{
                    plugins:['transform-runtime'],
                    presets:['es2015','stage-0','react']
                }
            },
            {
                test: /\.css$/,
                use: [ 'style-loader', 'css-loader' ]
              }
        ]
    },
 
    resolve:{
        extensions:['.jsx','.js','.json']
    }
};