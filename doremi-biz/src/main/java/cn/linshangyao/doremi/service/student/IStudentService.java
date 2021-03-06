/*
 * Copyright (c) 2015 Alibaba Group Holding Limited.
 * All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.linshangyao.doremi.service.student;

import java.util.List;

import cn.linshangyao.doremi.model.student.Student;

/**
 *
 * @author yao
 * @date 2015年5月31日
 */
public interface IStudentService {
    
    List<Student> getAllStudents();
    Student getStudentById(String id);
    public List<Student> getAllStudentsBySchlId(long schlId);
}
