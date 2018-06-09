if (defined.PRODUCTION) {
  config.plugins.push(new webpack.optimize.UglifyJsPlugin({
    minimize: true
  }));
  config.mode = "production"
  new webpack.DefinePlugin({
    "process.env": {
      NODE_ENV: JSON.stringify("production")
    }
  })
} else {
  config.mode = "development"
  new webpack.DefinePlugin({
    "process.env": {
      NODE_ENV: JSON.stringify("development")
    }
  })
}
