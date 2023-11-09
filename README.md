
# Project Title
스파르타 익명 게시판 API

## Tech Stack
**Server:** SpringBoot

## Features
- 게시글 등록
- 게시글 조회
- 게시글 목록 조회
- 게시글 수정
- 게시글 삭제

## UseCase
Insert UseCase Or UseCase Diagram

## API Reference
#### 게시글 등록
```http
  POST /api/v1/posts
```
| Parameter | Type     | Description          |
|:----------|:---------|:---------------------|
| `title`   | `String` | **Required**. 게시글 제목 |

#### 게시글 조회
```http
  GET /api/v1/posts/${postId}
```
| Parameter | Type   | Description           |
|:----------|:-------|:----------------------|
| `postId`        | `Long` | **Required**. 게시글 식별값 |

## ERD

## Running Tests
To run tests, run the following command
```bash
  ./gradlew test
```

## Demo
[Insert Demo Link](http://localhost:8080)

## License
[MIT](https://choosealicense.com/licenses/mit/)
