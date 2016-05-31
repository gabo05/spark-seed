var gulp = require('gulp');
var cleanCSS = require('gulp-clean-css');
var concat = require('gulp-concat');
var uglify = require('gulp-uglify');

gulp.task('default', ['minify-css', 'uglify'], function() {
  // place code for your default task here
});

gulp.task('minify-css', function() {
  return gulp.src('css/*.css')
    .pipe(concat('style.min.css'))
    .pipe(cleanCSS({compatibility: 'ie8'}))
    .pipe(gulp.dest('dist/css'));
});
gulp.task('uglify', function() {
  return gulp.src(['jsapp/*.js', 'jsapp/**/*.js'])
    .pipe(concat('script.min.js'))
    .pipe(uglify())
    .pipe(gulp.dest('dist/js'));
});
