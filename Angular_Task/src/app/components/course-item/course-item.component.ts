import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-course-item',
  templateUrl: './course-item.component.html',
  styleUrls: ['./course-item.component.css']
})
export class CourseItemComponent {
  @Input() course: any;

  openVideo() {
    if (this.course?.videoUrl) {
    window.open(this.course.videoUrl, '_blank');
  } else {
    console.log("No video URL available");
  }
  }
}
