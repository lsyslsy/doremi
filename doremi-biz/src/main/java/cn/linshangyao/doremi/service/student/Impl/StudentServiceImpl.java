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
package cn.linshangyao.doremi.service.student.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.linshangyao.doremi.dao.student.IStudentDao;
import cn.linshangyao.doremi.model.student.Student;
import cn.linshangyao.doremi.service.student.IStudentService;
/**
 *
 * @author yao
 * @date 2015年5月31日
 */
@Transactional
@Service
public class StudentServiceImpl implements IStudentService {
    @Autowired
    private IStudentDao studentDao;

    /**
     * 读取所有学生
     */
    public List<Student> getAllStudents() {
       
        return null;
    }

    /**
     * 
     */
    public Student getStudentById(String id) {
        return studentDao.getStudentById(id);
    }
}
